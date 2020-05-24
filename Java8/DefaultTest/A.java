package DefaultTest;

public interface A {

	default void defaultMethod(){ 
        System.out.println("Interface A default method"); 
    } 
}
