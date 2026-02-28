package fullstack;

public class Variables {

	int instanceVar = 100;      
    static int staticVar = 200; 

    public static void main(String[] args) {

        int localVar = 300;     

        Variables obj = new Variables();

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
}
}
