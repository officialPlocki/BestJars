package me.revoltix.bestjars;

import me.revoltix.bestjars.util.JarDownloader;
import me.revoltix.bestjars.util.Versions;
import me.revoltix.bestjars.util.files.FileBuilder;
import me.revoltix.bestjars.util.files.YamlConfiguration;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;

public class BestJars {

    private static final String OS = System.getProperty("os.name").toLowerCase();
    public static boolean IS_UNIX = (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));

    public static void main(String[] args) throws IOException {
        System.out.println("BestJar Jar Downloader - by twig.");
        System.out.println("FileSystem by Bukkit.");
        System.out.println("os.name: " + OS);
        /*if (!IS_UNIX) {
            System.out.println("This Jar only works with Linux.");
            System.exit(1);
        }
        System.out.println("Installing screen...");
        String[] str = {"apt-get", "update", "-y"};
        String[] str1 = {"apt-get", "upgrade", "-y"};
        String[] str2 = {"apt-get", "autoremove", "-y"};
        String[] str3 = {"apt-get", "install", "screen", "-y"};
        System.out.println("Tried to install screen.");
        Runtime.getRuntime().exec(str);
        Runtime.getRuntime().exec(str1);
        Runtime.getRuntime().exec(str2);
        Runtime.getRuntime().exec(str3);
        System.out.println("Trying to validate License...");*/
        FileBuilder fb = new FileBuilder("bestjars" + File.separator + "config.yml");
        YamlConfiguration yml = fb.getYaml();
        if(!yml.isSet("setup")) {
            yml.set("setup", false);
            //yml.set("license", "YourLicenseKey");
            yml.set("bestjars.version", "1.18.1");
            yml.set("bestjars.servername", "BestJarServer");
            yml.set("bestjars.experimental", false);
            yml.set("bestjars.ram", 1024);
            yml.set("bestjars.eula", false);
            yml.set("info", List.of(
                    "Setze die flag \"eula\" auf \"true\", um die Minecraft EULA zu Akzeptieren. EULA: https://www.minecraft.net/de-de/terms",
                    "Für alle Versionen unter der 1.18.2: Bitte Log4J fix zur Sicherheit installieren. Empfehlung: https://www.spigotmc.org/resources/log4jexploit-fix.98243/",
                    "Der Server wird danach mit \"screen -x SERVERNAME\" aufrufbar sein.",
                    "Die RAM Anzahl ist in MegaByte.",
                    "Wenn du experimental auf \"true\" stellst, können Beta Versionen von Jars heruntergeladen werden.",
                    "",
                    "",
                    "Jars von etil2jz (GitHub), foss-mc (GitHub), Gardling.com, papermc.io, nopjmp (GitHub), PatinaMC (GitHub)",
                    "Versionen: 1.8.8, 1.12.2, 1.13.2, 1.14.4, 1.15.2, 1.16.5, 1.17.1, 1.18.1",
                    "Experimental Versionen: 1.12.2, 1.16.5, 1.17.1, 1.18.1",
                    "Ansonsten automatisch normale Version"));
            fb.save();
        }
        /*try {
            BufferedInputStream inputStream = new BufferedInputStream(new URL("http://licensing.revoltix.me:81/activation?license=" + yml.getString("license")).openStream());
            byte[] contents = new byte[1024];
            int bytesRead;
            String response = null;
            while ((bytesRead = inputStream.read(contents)) != -1) {
                response = new String(contents, 0, bytesRead);
            }
            response = new String(Base64.getDecoder().decode(response.getBytes(StandardCharsets.UTF_8)));
            if(Boolean.parseBoolean(response.split(":")[0])) {
                if((System.currentTimeMillis() - Long.parseLong(response.split(":")[1])) < 10000) {
                    System.out.println("License validated!");
                } else {
                    System.out.println("License is invalid!");
                    System.exit(1);
                }
            } else {
                System.out.println("License is invalid!");
                System.exit(1);
            }
        } catch (Exception ex) {
            System.out.println("Cannot connect to license server!");
            ex.printStackTrace();
            System.exit(1);
        }*/
        if(!yml.getBoolean("setup")) {
            yml.set("setup", true);
            fb.save();
        }
        Versions version = null;
        String v = yml.getString("bestjars.version");
        if(v.equalsIgnoreCase("1.8.8")) {
            version = Versions.v1_8_8;
        } else if(v.equalsIgnoreCase("1.12.2")) {
            version = Versions.v1_12_2;
        } else if(v.equalsIgnoreCase("1.13.2")) {
            version = Versions.v1_13_2;
        } else if(v.equalsIgnoreCase("1.14.4")) {
            version = Versions.v1_14_4;
        } else if(v.equalsIgnoreCase("1.15.2")) {
            version = Versions.v1_15_2;
        } else if(v.equalsIgnoreCase("1.16.5")) {
            version = Versions.v1_16_5;
        } else if(v.equalsIgnoreCase("1.17.1")) {
            version = Versions.v1_17_1;
        } else if(v.equalsIgnoreCase("1.18.1")) {
            version = Versions.v1_18_1;
        } else {
            if(v.equalsIgnoreCase("1.18.2")) {
                yml.set("bestjars.version", "1.18.1");
                fb.save();
                version = Versions.v1_18_1;
            } else {
                System.err.println("Unexpected Jar version");
                System.exit(1);
            }
        }
        boolean experimental = yml.getBoolean("bestjars.experimental");
        if(yml.getBoolean("bestjars.eula")) {
            File file = new File("eula.txt");
            if(!file.exists()) {
                file.createNewFile();
                PrintWriter writer = new PrintWriter(new FileWriter(file, true), true);
                writer.append("eula=true");
                writer.flush();
                writer.close();
            }
        }
        JarDownloader.download(version, experimental);
        JarDownloader.start(yml.getString("bestjars.servername"), yml.getInt("bestjars.ram"));
    }

}
