import java.util.Scanner; public class GameTree {
    QuestionNode root; QuestionNode currentNode;
    
    public GameTree(QuestionNode root) { this.currentNode = this.root = root;
    }
    
    public void Start() { while(this.currentNode != null) {
    System.out.println(this.currentNode.question); String answer = this.ReadInput();
    if (answer.equalsIgnoreCase("yes")) { this.AnswerYes();
    } else {
    this.AnswerNo();
    }
    }
     
    
    }
    
    public void AnswerYes() {
    this.currentNode = this.currentNode.yes;
    }
    
    public void AnswerNo() {
    this.currentNode = this.currentNode.no;
    }
    
    public String ReadInput() {
    Scanner scanner = new Scanner(System.in); return scanner.nextLine();
    }
    }
    