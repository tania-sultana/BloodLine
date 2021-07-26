package chatting.datas;

public class Datas {
    private String Name;
    private String Image;
    private String Host;
    private int Port;
    public String getName(){
        return this.Name;
    }
    public String getImage(){
        return this.Image;
    }
    public String getHost(){return this.Host;}
    public int getPort(){
        return this.Port;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setImage(String image){
        this.Image = image;
    }
    public void setHost(String host){
        this.Host = host;
    }
    public void setPort(int port){
        this.Port = port;
    }
}
