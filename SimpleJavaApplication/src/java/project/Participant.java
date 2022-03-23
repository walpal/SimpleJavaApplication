package SimpleJavaApplication.src.java.project;

public class Participant {
    private String name;
    private Integer id;
    private String mail;
    private String phone;
    private String organization;

    // get and set methods:
    // Getter
    // public datatype get"methodname"() {
        // return method
    // }
    // Setter
    // public void set"methodname"(datatype method) {
        // this.method = method}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Participants{" + 
                "name='" + name + '\'' +
                ", id=" + id +'}';
           
    }
}