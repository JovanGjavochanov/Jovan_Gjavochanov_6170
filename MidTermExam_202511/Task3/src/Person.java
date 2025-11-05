class Person {
    protected String name;
    protected int universityId;

    public Person(String name, int universityId) {
        this.name = name;
        this.universityId = universityId;
    }

    public void displayDetails() {
        System.out.println("Person: " + name + ", ID: " + universityId);
    }
}




