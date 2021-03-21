# Java-based-implementation-of-Generic-Stack-and-Deque-data-structures

This is an Java 8 based implementation of generic Deque and Stack data structures. The Deque class has been implemented using Java arrays and uses a growable circular array formulation. The Stack interfaces uses the deque implementation. 

# Folders

- Deque
  - ArrayDeque.java => Implements the DequeInterface
  - ArrayDequeTester.java => File with the main function that uses all the functions that implemented in the ArrayDeque class
  - DequeInterface.java => File defining the deque interface
  - EmptyDequeException.java => File defines a custom exception
  - Makefile 

- Stack_FabricBreakupPuzzle 
  - EmptyStackException.java => File defines a custom stack exception
  - Stack.java => Implements the StackInterface
  - StackInterface.java => File defining the stack interface
  - StackTester.java => File with the main function that tests all the stack functions of the Stack class
  - FabricBreakup.java => File with the main function to implement the program to solve the puzzle
  - FormatChecker => Running formatChecker.jar with arguments inputfile.txt and output.txt double checks whether the code satisfies the input-output requirements of the assignment 
    > Usage - java -jar formatChecker.jar sampleInputFile.txt sampleOutputFile.txt
  - Makefile
  - sampleInputFile.txt
  - sampleOutputFile.txt
  - myoutfile.txt => This file will contain the output of the FabricBreakup class implementation
