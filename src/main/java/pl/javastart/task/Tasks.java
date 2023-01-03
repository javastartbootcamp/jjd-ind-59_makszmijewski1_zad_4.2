package pl.javastart.task;

public class Tasks {

    private String name;
    private String description;
    private int priority;
    private Person responsiblePerson;

    public Tasks(String name, String description, int priority,
                 Person responsiblePerson) {
        this(name, description, priority);
        this.responsiblePerson = responsiblePerson;
    }

    public Tasks(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Tasks(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean highPriority() {
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }
}
