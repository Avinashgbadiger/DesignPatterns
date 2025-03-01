package singleton;

/*
 *  LAZY WAY OF CREATING SINGLETON OBJECT
 * 1.Constructor should be private
 * 2.Create an Object with the help of Static Method
 *  ( To access the Method need of Object So Create a Static Method );
 *  3.Add the condition for checking the Object is NULL
 *  4.IF IT IS MORE FOCUSSED ON THE MULTI-THREADING APPLICATION MAKE IT SYNCHRONIZED
 *  5.IF NOT KEEP LIKE THIS
 *
 */
public class Samosa {



    private static Samosa samosa;

    private Samosa() {
//        if (samosa!=null)
//        {
//            throw new RuntimeException("You're Trying to Break Singleton Object Creation");
//        }

    }

    public static Samosa getSamosa() {
        if (samosa == null) {
            synchronized (Samosa.class) {
                return samosa = new Samosa();
            }
        } else {
            return samosa;
        }
    }
}
