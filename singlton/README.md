## Getting Started

--> class has only one instance and provide global access point to it;

--> code can be break in multithreading environment
solution: 
-> senchronization lock -- expensive process due to system level calling
--> static initilization(eager initialization) - degraded performance due to wastage of resource --> eg. create object even we do not needed.

--> 


## Example
--> Centralize control, Database connection and configuration settings.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
