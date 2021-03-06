# FLiteSharp
FLite# is a functional language representing a subset of the programming language F#. It includes the basic features of
F#, such as arithmetic and boolean operations, lists, tuples, functions and lambda expression, but it also implements 
two peculiar F# features: units of measure and pattern matching. FLite# comes with a Java interpreter.

FLite# has been implemented as final project for the module CS4215 Programming Language Implementation, AY2021-22.

## Run
An already built jar executable is available [here](executable/). Running this jar requires at least Java 17.0.2.
To run the executable is sufficient to launch the following command from console:

<code>java -jar FLiteSharp.jar myCode.fs</code>

where <code>myCode.fs</code> is the name or the path to the file containing the FLite# source code to execute.

Examples of FLite# programs can be found [here](app/src/main/resources/).

Alternatively, you can run FLite# code on this web [playground](https://flitesharp.dev/). Have fun!

## Build
Building the project requires having installed both Java and Gradle Build Tool.

To build the project move to the root directory of the repository and run the command 
<code>gradle build</code>
from console.

This will generate an executable <code>FLiteSharp.jar</code> in the directory <code>/FLiteSharp/app/build/libs</code>. 
Follow the instructions in the run section to execute it.

## Documentation
The documentation about FLite# language can be found [here](documentation/) and includes a user manual and a developer 
manual.

The technical documentation of the intepreter can be automatically generated from the source code using Gradle Build Tool. To
generate the documentation move to the root directory of the repository and launch the command <code>gradle 
javadoc</code> from console.

To navigate the generated documentation access the file <code>/FLiteSharp/app/build/docs/javadoc/index.html</code>.



