import java.util.Scanner;

public class XOGame{

    private String[] _board = {" "," "," "," "," "," "," "," "," "};
    private String _turn;

    public XOGame(){
        _turn = "X";
    }

    public void boardChange(String[] args) {
        boolean check = true;
        int Spot = 0;

                while(check){
                Scanner placeScanner = new Scanner(System.in);
                System.out.println("It is " + _turn +"' turn");
                System.out.println("Location to place (1-9) -->");
                Spot = placeScanner.nextInt();
            
                check = false;

                if(_board[Spot-1] != " "){
                    System.out.println("There is already a shape there!!!");
                    check = true;
                }
                
            }
            

        _board[Spot-1] = _turn;


    }

    public void boardPrint(){
        System.out.println(_board[0] + "|" + _board[1] + "|" + _board[2]);
        System.out.println("-----");
        System.out.println(_board[3] + "|" + _board[4] + "|" + _board[5]);
        System.out.println("-----");
        System.out.println(_board[6] + "|" + _board[7] + "|" + _board[8]);
    }

    public boolean winCheck(){
        if (_board[0] == _turn & _board[1] == _turn & _board[2] == _turn ||
            _board[3] == _turn & _board[4] == _turn & _board[5] == _turn ||
            _board[6] == _turn & _board[7] == _turn & _board[8] == _turn ||
            _board[0] == _turn & _board[3] == _turn & _board[6] == _turn ||
            _board[1] == _turn & _board[4] == _turn & _board[7] == _turn ||
            _board[2] == _turn & _board[5] == _turn & _board[8] == _turn ||
            _board[0] == _turn & _board[4] == _turn & _board[8] == _turn ||
            _board[2] == _turn & _board[4] == _turn & _board[6] == _turn ){
                System.out.println(_turn + " Has won!!!");
            return true;

    }
    else{
        return false;
    }
    }

    public void turnChange(){
        if( _turn=="X"){
            _turn = "O";
        }
        else{
            _turn = "X";
        }
    }
}


