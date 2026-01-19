Last login: Sun Jan 18 16:41:26 on ttys000
divyanshsingh@Divyanshs-MacBook-Air ~ % cd eclipse-workspace 
divyanshsingh@Divyanshs-MacBook-Air eclipse-workspace % ls 
.		..		.DS_Store	.metadata	multithreaded
divyanshsingh@Divyanshs-MacBook-Air eclipse-workspace % cd multithreaded/
divyanshsingh@Divyanshs-MacBook-Air multithreaded % cd 
divyanshsingh@Divyanshs-MacBook-Air ~ % cd eclipse-workspace 
divyanshsingh@Divyanshs-MacBook-Air eclipse-workspace % cd multithreaded/
divyanshsingh@Divyanshs-MacBook-Air multithreaded % cd src 
divyanshsingh@Divyanshs-MacBook-Air src % ls
.		..		multithreaded
divyanshsingh@Divyanshs-MacBook-Air src % cd multithreaded/
divyanshsingh@Divyanshs-MacBook-Air multithreaded % ls 
.		..		Client.class	Client.java	Server.class	Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreaded % javac Server.java 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % java Server.
Error: Could not find or load main class Server.
Caused by: java.lang.ClassNotFoundException: Server.
divyanshsingh@Divyanshs-MacBook-Air multithreaded % java Server
Error: Could not find or load main class Server
Caused by: java.lang.NoClassDefFoundError: Server (wrong name: multithreaded/Server)
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.class
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.java 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.class
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreaded % cd  ..
divyanshsingh@Divyanshs-MacBook-Air src % cd multithreaded 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Client.java 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreaded % javac Server.class
error: invalid flag: Server.class
Usage: javac <options> <source files>
use --help for a list of possible options
divyanshsingh@Divyanshs-MacBook-Air multithreaded % javac Client.java 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % java Server
Error: Could not find or load main class Server
Caused by: java.lang.NoClassDefFoundError: Server (wrong name: multithreaded/Server)
divyanshsingh@Divyanshs-MacBook-Air multithreaded % vi Server.java 
divyanshsingh@Divyanshs-MacBook-Air multithreaded % javac Server.java 
Server.java:35: error: illegal character: '\'
			Socket acceptedSocket = serverSocket.accept();\
			                                              ^
1 error
divyanshsingh@Divyanshs-MacBook-Air multithreaded % javac Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreaded % java Server
Server is listening on port 8010
^C%                                                                                                                                                                                                         divyanshsingh@Divyanshs-MacBook-Air multithreaded % java Server      
Server is listening on port 8010
^C%                                                                                                                                                                                                         divyanshsingh@Divyanshs-MacBook-Air multithreaded % ls
.		..		Client.class	Client.java	Server.class	Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreaded %  cd .. 
divyanshsingh@Divyanshs-MacBook-Air src % cd .. 
divyanshsingh@Divyanshs-MacBook-Air multithreaded %  cd
divyanshsingh@Divyanshs-MacBook-Air ~ % cd Developer/java
divyanshsingh@Divyanshs-MacBook-Air java % ls
.		..		.DS_Store	practice	Test.java
divyanshsingh@Divyanshs-MacBook-Air java % cd practice 
divyanshsingh@Divyanshs-MacBook-Air practice % LS
Main.java		Method.java		multithreadedserver	singlethreadserver
divyanshsingh@Divyanshs-MacBook-Air practice % rm -rf Method.java Main.java
divyanshsingh@Divyanshs-MacBook-Air practice % ls
.			..			multithreadedserver	singlethreadserver
divyanshsingh@Divyanshs-MacBook-Air practice % cd multithreadedserver 
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % ls
.		..		.project	Client.class	Client.java	Client$1.class	Server.class	Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % java Server
Server is listening on port 8010
^C
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % 
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % vi Readme.md 
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % ls
.		..		.project	Client.class	Client.java	Client$1.class	Readme.md	Server.class	Server.java
divyanshsingh@Divyanshs-MacBook-Air multithreadedserver % vi Readme.md

#Implemenation of Web Servers in Java

- Single Threaded Server Architecture
- Multi Threaded Server Architecture


~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
~                                                                                                                                                              
"Readme.md" 6L, 11
