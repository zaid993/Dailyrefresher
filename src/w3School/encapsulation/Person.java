package w3School.encapsulation;

public class Person {

    /*

Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable



     */

    private String name;

    //Getter void and return same variable type (read only)

    public String getName(){
        return name;
    }

    //Setter void and no return (Write only)
    public void setName(String name){
        this.name=name;
    }


}




