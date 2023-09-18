package me.revoltix.bestjars.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class JarDownloader {

    public static void download(Versions version, boolean experimental) {
        if(!new File("bestjars_server.jar").exists()) {
            System.out.println("Lade Jar...");
            try {
                new File("bestjars_server.jar").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
        if(!experimental) {
            if(version.equals(Versions.v1_8_8)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.8.8/builds/445/downloads/paper-1.8.8-445.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_12_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.12.2/builds/1620/downloads/paper-1.12.2-1620.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_13_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.13.2/builds/657/downloads/paper-1.13.2-657.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_14_4)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.14.4/builds/245/downloads/paper-1.14.4-245.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_15_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.15.2/builds/393/downloads/paper-1.15.2-393.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_16_5)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://github.com/foss-mc/Patina/raw/releases/1.16.5/1.16.5-paperclip.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_17_1)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://github.com/PatinaMC/Patina/raw/releases/1.17.1/Patina-1.17.1-R0.1-SNAPSHOT.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_18_1)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://www.gardling.com/jenkins/job/JettPack/lastSuccessfulBuild/artifact/target/jettpack-paperclip-b440.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        } else {
            if(version.equals(Versions.v1_8_8)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.8.8/builds/445/downloads/paper-1.8.8-445.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_12_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://github.com/nopjmp/Dionysus/releases/download/v0.1.14/dionysus-paperclip.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_13_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.13.2/builds/657/downloads/paper-1.13.2-657.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_14_4)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.14.4/builds/245/downloads/paper-1.14.4-245.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_15_2)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://papermc.io/api/v2/projects/paper/versions/1.15.2/builds/393/downloads/paper-1.15.2-393.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_16_5)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://github.com/foss-mc/Patina/raw/releases/1.16.5/1.16.5-paperclip.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_17_1)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://www.gardling.com/jenkins/job/JettPack/279/artifact/target/jettpack-paperclip-b279.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            } else if(version.equals(Versions.v1_18_1)) {
                try (BufferedInputStream in = new BufferedInputStream(new URL("https://github.com/etil2jz/Mirai/raw/build/1.18.2/Mirai-1.18.2-R0.1-SNAPSHOT.jar").openStream());
                     FileOutputStream fileOutputStream = new FileOutputStream("bestjars_server.jar")) {
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Failed to download Jar!");
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }
    }

    public static void start(String serverName, int ram) {
        File file = new File("bestjars_server.jar");
        if(file.exists()) {
            System.out.println("Starte Jar...");
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                String[] str = {/*"screen", "-dmS", serverName,*/ "java", "-Xmx" + ram + "M", "-Xms" + ram + "M", "-jar", "bestjars_server.jar"};
                try {
                    Runtime.getRuntime().exec(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
            System.exit(0);
        }
    }

}
