# Java Data Types Interview Questions - Categorized by Difficulty

## 🎯 Expert Level

### Advanced Concepts
55. **Why does Java provide primitive data types in spite of the fact that it makes it only 99% OOP?**  
    **A:** Because creation of variables using primitive data types is faster than creating an object using wrapper classes

56. **Why does Java provide four data types to manage Integer type data?**  
    **A:** Because in real world integer data exists in varying magnitudes

57. **Why does Java provide two data types to manage real number type data?**  
    **A:** For less precision and higher precision i.e. double type provides more accuracy than float type

58. **How do we make a project coded in Java a pure OOP project?**  
    **A:** Using wrapper classes

59. **What is the role of wrapper classes in Java?**  
    **A:** Using wrapper classes, creation of primitive variables can be avoided and hence a pure object oriented project can be developed

60. **What happens if a larger magnitude data is assigned to a value of a data type which cannot handle it?**  
    **A:** Overflow or loss of precision occurs

61. **Should type casting be performed explicitly?**  
    **A:** Depends upon whether implicit or explicit typecasting is performed

62. **Does type casting reduce the precision of the data?**  
    **A:** Depends upon whether implicit or explicit typecasting is performed. Implicit typecasting does not reduce precision whereas explicit typecasting reduces precision

63. **Should numeric promotion be performed explicitly?**  
    **A:** No. Numeric promotion also known as implicit casting or java automatic conversions where conversion of a smaller numeric type to a larger numeric type takes place

64. **Does numeric promotion reduce the precision of the data?**  
    **A:** No

65. **What is numeric promotion?**  
    **A:** When data of a smaller magnitude is placed within a memory location of a larger magnitude, it is called as numeric promotion. Implicit typecasting is also called as numeric promotion

66. **Give the implicit upcasting chart or numeric promotion chart?**  
    **A:** (Refer to Java documentation: byte → short → int → long → float → double)

67. **Which Java operator is right to left associative?**  
    **A:** Assignment operator (=)

### Memory & Storage Details
68. **Why should data be stored in form of 0s and 1s in the memory?**  
    **A:** Because every memory device can store only 0's and 1's

69. **What is the role of formats in data types?**  
    **A:** It is used to convert real world data in its original form into 0s and 1s so that it can be stored in the memory unit

70. **How is a negative number stored in Byte data type?**  
    **A:** Using 2's compliment base-2 format

71. **How is a negative number stored in short data type?**  
    **A:** Using 2's compliment base-2 format

72. **How is a negative number stored in int data type?**  
    **A:** Using 2's compliment base-2 format

73. **How is a negative number stored in long data type?**  
    **A:** Using 2's compliment base-2 format

74. **How many bytes are allocated for boolean data type in Java?**  
    **A:** It is OS dependent or JVM dependent

75. **In what format is yes/no data stored in memory unit?**  
    **A:** It is JVM dependent

76. **Do we have unsigned integer format in Java?**  
    **A:** Not up to java 1.7. However, from java 1.8 it is supported

77. **Can we use the float data type to hold the precise values such as currency?**  
    **A:** No. Rather, inbuilt class Currency is used

78. **Can we use the double data type to hold the precise values such as currency?**  
    **A:** No. Rather, inbuilt class Currency is used

### Real-world Data Handling
79. **What are the different types of data in real world?**  
    **A:** Character type data, integer type data, real number type data, yes/no type data, still picture type data, audio and video type data

80. **In what format is still picture data stored in memory unit?**  
    **A:** .jpeg format and .gif format

81. **In what format is audio data stored in memory unit?**  
    **A:** .mp3 format

82. **In what format is video data stored in memory unit?**  
    **A:** .mp4 format and .avi format

83. **How is audio type data handled in Java?**  
    **A:** Using in built classes

84. **How is video type data handled in Java?**  
    **A:** Using in built classes

85. **How is still picture type data handled in Java?**  
    **A:** Using in built classes

