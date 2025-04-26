package prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;

    private String importantData;

    private List<String> listOfDomains = new ArrayList<>();

    public List<String> getListOfDomains() {
        return listOfDomains;
    }


    public void setListOfDomains(List<String> listOfDomains) {
        this.listOfDomains = listOfDomains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        Thread.sleep(5000);
        this.importantData = "this is very very Important date";
        this.listOfDomains.add("192.168.1.198");
        this.listOfDomains.add("com.tableau.net");
        this.listOfDomains.add("www.google.com");
        //it will take 5 min
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", listOfDomains='" + this.listOfDomains + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        for (String str : this.getListOfDomains()) {
            networkConnection.getListOfDomains().add(str);
        }
        return networkConnection;
    }
}
