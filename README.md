# JavaCourse_SpringBase
 
Welcome to the <ins>Java Learning Project</ins>, specifically designed for beginners to grasp fundamental concepts of Java programming. This project serves as a practical implementation of the second lesson in learning Java, covering the topic of Java programming along with the Spring framework.

## Project Overview

This project demonstrates the use of Java and the Spring framework to implement a simple mechanism for calculating the area of geometric shapes. It includes the following components:

### Interface

* **Shape**: Represents various geometric shapes and defines a method `calculateArea()` to calculate the area of each shape.

### Classes

* **Circle**: Implements the `Shape` interface and calculates the area of a circle.
* **Square**: Implements the `Shape` interface and calculates the area of a square.
* **Mechanism**: Depends on the `Shape` interface and uses instances of `Circle` and `Square` classes to calculate and print the areas of the shapes.

### Configuration

The project uses Spring XML configuration to define and wire the beans. Here's a brief overview of the bean configuration:

* Beans are defined for the `Circle` and `Square` classes, each with the necessary constructor arguments or properties.
* Beans are defined for the `Mechanism` objects, which depend on the `Shape` interface.
* External properties are used for configuring the side length of the square shape.

## Getting Started

Follow these instructions to set up and build the project using Maven:

### Prerequisites

Make sure you have the following software installed on your system:

* Java Development Kit (JDK) 8 or higher
* Apache Maven

### Installation

1. Clone the repository to your local machine:
```
git clone https://github.com/ArtemDaemon/JavaCourse_SpringBase
```
2. Navigate to the project directory:
```
cd <project-directory>
```
3. Build the project using Maven:
```
mvn clean install
```

### Configuration

* Configure the properties in `spring-config.xml` if necessary.
* Ensure that the package structure and class names match the configuration in the Spring XML file.

### Usage

* Run the application using the following command:
```
java -jar target/<jar-file-name>.jar
```

### Troubleshooting

If you encounter any issues during setup or running the project, refer to the troubleshooting section in the README file or seek assistance from the course instructor or community forums.

## Contributing

Contributions to this project are welcome! Feel free to submit pull requests for bug fixes, enhancements, or new features.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgements

We acknowledge the contributors and maintainers of the Spring framework for their invaluable work and support in developing this project. Thank you to all the students for their participation and dedication to learning.
