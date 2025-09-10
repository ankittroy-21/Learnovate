# Java Data Types Interview Questions - Categorized by Difficulty

## 🟡 Intermediate Level

### Data Storage & Formats
26. **In what format is Integer data stored in memory unit?**  
    **A:** base-2 format

27. **In what format is real number data stored in memory unit?**  
    **A:** IEEE format

28. **In what format is character data stored in memory unit?**  
    **A:** UTF-16 format or UTF-32 format

29. **Does Java follow ASCII or UNICODE? Why?**  
    **A:** UNICODE. Because UNICODE would be having binary representations for all the symbols of all the languages which are currently used across the globe

30. **Why did UNICODE come into existence?**  
    **A:** Because ASCII does not have binary representation for all the symbols of all the languages which are currently used across the globe

31. **What is UTF?**  
    **A:** UTF stands for Universal Translational Format

32. **What is UTF-8? When is it used normally?**  
    **A:** UTF-8 is used whenever binary representations for only English and its associated symbols are required in the project

33. **What is UTF-16? When is it used normally?**  
    **A:** UTF-16 is used whenever the binary representations for all the symbols of all the languages which are currently used across the world are required in the project

34. **What is UTF-32? When is it used normally?**  
    **A:** UTF-32 is used whenever along with current languages symbols, even ancient languages symbols' binary representations are required in the project

35. **How many bit format is ASCII exactly?**  
    **A:** 7 bit format

36. **Why is ASCII format forcefully stored as 8-bit format?**  
    **A:** Because minimum memory that can be allocated is 1 Byte i.e. 8 bits

### Type Conversion & Operations
37. **How can you convert double data type to float data type in Java?**  
    **A:** i) By explicit typecasting: `float a = (float) 24.17;`  
    ii) By adding suffix 'f': `float a = 24.17f;`

38. **What is meant by rounding towards zero in integer division?**  
    **A:** Truncation, i.e. fractional portion is truncated and only the integer portion is retained

39. **What is meant by truncation?**  
    **A:** Truncation is the process of eliminating the fractional part and retaining only the integer portion. It is also called as rounding towards zero

40. **What is the difference between the prefix and postfix forms of the ++ operator?**  
    **A:** Pre increment: increment first and then assign, post increment: first assign and then increment

41. **Can a double value be cast to a byte?**  
    **A:** Yes

42. **Express double a = 123.45 in scientific notation?**  
    **A:** double a = 1.2345E+2

43. **What is the difference between declaring a variable and defining a variable?**  
    **A:** `int a;` // declaring, `int a=100;` // defining

### Special Topics
44. **Is zero a positive number or negative number in programming? Why?**  
    **A:** Zero is a positive number, because the most significant bit in the positive number is zero

45. **Are true and false keywords?**  
    **A:** true and false are reserved words

46. **What does a prefix 0 indicate in a literal?**  
    **A:** It indicates that the number is an Octal

47. **What does a prefix 0x indicate in a literal?**  
    **A:** It indicates that the number is Hexadecimal

48. **How do we display a \ in Java?**  
    **A:** `System.out.println("\\");`

49. **How do we display " in Java?**  
    **A:** `System.out.println("\"");`

50. **How do we display ' in Java?**  
    **A:** `System.out.println("\'");`

51. **Can we use underscore in a literal?**  
    **A:** Yes

52. **What are the rules associated with the usage of underscore in a literal?**  
    **A:** Underscore can only be used in between the literal any number of times. It cannot be used: before/after literal, before/after prefix, before/after suffix, or before/after decimal points

53. **Can we create binary literals in Java?**  
    **A:** Yes. Using a prefix `0b`

54. **How is a binary literal created in Java?**  
    **A:** Using the prefix `0b`

