# 2. Semesterprojekt

## Get started

Clone this repository to a local directory.
```sh
git clone https://github.com/kvartborg/2-semesterprojekt
```
Open the cloned repository in your NetBeans IDE and everything should be
working out of the box.
If you dont use NetBeans you can compile the project with [`nbcompile`](https://github.com/kvartborg/nbcompile)
directly from the terminal.

## Authors

  - [Frederik Kvartborg Albertsen](https://github.com/kvartborg)
  - [Jeppe Niemann](https://github.com/GGkarma)
  - [Lasse Drews Marquardt](https://github.com/Ladremarq)
  - [Mads Due Kristensen](https://github.com/MadsDueKristensen)
  - [Niclas Johansen](https://github.com/NJohansen)
  - [Victor Gram Thomsen](https://github.com/grammeaway)

### Configuration
Create a new file named `PostgreSQLConfig.java` within `src.config` package. This files should include the authentication credentials for the postgres database.
```java
public class PostgreSQLConfig {
  public String host = "jdbc:postgresql://localhost:5432";
  public String user = "user";
  public String password = "password";
}
```

## License

This project is licensed under the [MIT License](https://github.com/kvartborg/1-semesterprojekt/blob/master/LICENSE).
