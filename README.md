# Geometry
## Problem description
- Users want to calculate length of line on an XY plane
- Users want to compare two lines of equality based on its endpoints so they know when two lines are equal

## Developement environment setup
JDK 11
JUnit 5
Gradle 7.2

## How to run test
```
  ./gradlew test
```

## Build instruction
```
  ./gradlew build
```

## Use Instruction
```java
import com.minibootcamp.ada.Line;

public class YourClass {

    public static void main(String[] args) {
        Line line = new Line(1, 1, 3, 4); // Initialize the library inside your class
        line.getLength(); // The function to calculate the length
    }
}
```
