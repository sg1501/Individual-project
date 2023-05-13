public class QuestionNode { String question; QuestionNode yes; QuestionNode no;

    public QuestionNode(String question) { this.question = question;
    this.yes = null; this.no = null;
    }
    
    public void SetYesQuestion(QuestionNode yes) { this.yes = yes;
    }
    
    public void SetNoQuestion(QuestionNode no) { this.no = no;
    }
    }
    