public class XOMain {

    public static void main(String[] args) {
        
    XOGame game1 = new XOGame();
    int i = 0;

    while(!game1.winCheck()){

        game1.boardChange(args);
        game1.boardPrint();
    
        game1.turnChange();
        i++;
        if(i==9){
            System.out.println("tie");
            break;
        }


    }

    }

    
}