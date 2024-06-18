# Store Callback System

This project demonstrates a basic implementation of the observer pattern using interfaces in Java. The system consists of a `Store` class where `Customer` can register to be notified about sales.
## Overview

- **Member Interface**: This interface defines a `callback` method that must be implemented by any class that wants to register with the `Store`.
- **Store Class**: This class allows `Customer` objects to register and notifies them when a sale is happening.
- **Customer Class**: This class implements the `Member` interface and defines the `callback` method to respond to sale notifications.
## Usage

1. **Clone the repository**:
    ```sh
    git clone https://github.com/Shaunakk235/store-callback-system.git
    cd store-callback-system
    ```

2. **Compile the Java files**:
    ```sh
    javac StoreCallback.java
    ```

3. **Run the main class**:
    ```sh
    java StoreCallback
    ```
## Expected Output
- Thanks I'll Visit Jake
- Thanks I'll Visit John
## Contribution

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.