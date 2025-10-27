 # Checked vs Unchecked Exceptions

| Aspect | Checked Exceptions | Unchecked Exceptions |
|--------|-------------------|---------------------|
| Compile-time | Checked at compile time | Not checked at compile time |
| Inheritance | Extend Exception class | Extend RuntimeException class |
| Handling | Must be handled using try-catch or throws | Optional to handle |
| Examples | IOException, SQLException | NullPointerException, ArrayIndexOutOfBoundsException |
