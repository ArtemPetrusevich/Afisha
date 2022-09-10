public class Afisha {
    private int id;
    private String name;
    private int picture;
    private String type;
    private int count = 5;


    private Afisha[] items = new Afisha[0];
    public void setCountLast(int count){
        this.count=count;

    }
    public void save(Afisha item){
        Afisha[] tmp = new Afisha[items.length +1];
        for (int i = 0 ; i< items.length; i++){
            tmp[i] = items[i];

        }
        tmp[tmp.length -1 ]=item;
        items = tmp;
    }
    public Afisha(int id,String name, int picture,String type){
        this.id=id;
        this.name=name;
        this.picture=picture;
        this.type=type;}

    public void removeById(int id){
        Afisha[] tmp = new Afisha[items.length - 1];
        int copyToIndex = 0;
        for (Afisha item : items){
            if (item.getId()!= id+1){
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
            items= tmp;

        }

    }
    public void fixRemoveById(int id){
        Afisha[] tmp = new Afisha[items.length - 1];
        int copyToIndex = 0;
        {
            if (getId() == id){
                tmp[copyToIndex] = items[copyToIndex];
                copyToIndex++;
            }
            items= tmp;

        }

    }
    public int getId(){
        return id;

    }
    public Afisha[] findAll(){return items;


    }
    public Afisha[] findLast(){


        Afisha[] tmp = new Afisha[count];
        int itemNumber= 0;

        for (int i = items.length-1; i>= items.length -count; i--){
            tmp[itemNumber]=items[i];
            itemNumber++;
        }
        return tmp;


    }


}

