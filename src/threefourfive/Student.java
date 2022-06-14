package threefourfive;

public class Student {
    private String name;
    private int age;
    private TaskList tasks;

    public Student(String name, int age, TaskList tasks) {
        this.name = name;
        this.age = age;
        this.tasks = tasks;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setTasks(TaskList tasks) {
        this.tasks = tasks;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public TaskList getTasks() {
        return tasks;
    }

    public int getAge() {
        return age;
    }

}