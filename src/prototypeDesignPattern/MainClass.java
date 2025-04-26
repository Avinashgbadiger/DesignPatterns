package prototypeDesignPattern;

public interface MainClass {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("Ip : 192.168.1.89");
       networkConnection.loadVeryImportantData();

        System.out.println("------------");
        System.out.println(networkConnection.toString());



        try {
           NetworkConnection connection1 = (NetworkConnection) networkConnection.clone();
            connection1.getListOfDomains().remove(0);
            NetworkConnection connection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection connection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(connection1.toString());
            System.out.println(connection2.toString());
            System.out.println(connection3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
