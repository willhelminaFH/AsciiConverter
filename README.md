AsciiConverter
==============

wip pixel value to ascii converter
an extension of the first assignment I handed in using only the built in java libraries.  The project is a 
(somewhat pointlessly) multithreaded application which loads an image, converts it to gray scale and reprocesses the 
pixel data into ascii characters.  The main purpose of the project for me was to explore Swing, which I've never used 
before.

This project uses many of the objects from the swing library.  JLabes with ImageIcons to display the images, a JButton 
and FileChooser for user interface, SwingWorker (technically from the utilities library) for the asynchronous image 
processing as well as a few others.  although every thing runs smoothly, the archetecture is haphazard at best (I point 
out in the comments some places where and how it could improve).  

Since I have other java based projects that I'm working on I'm not sure if I'll come back to this one, I do however 
appreciate it's whimsy and if I fix it up I might use it for making some logos or something.  Over the winter I'm going 
to be working on two different android apps, one which scours imigur for pictures of cats using a dector trained with the 
eigenfaces algorithm.  and another which automatically sends really sweet texts to my girlfriend.
