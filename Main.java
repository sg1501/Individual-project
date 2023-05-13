import java.util.Set;

public class Main {
    static QuestionNode startGame, isFlexible, isSingleInstance, isSingletonPattern,
            isBuilderPattern, isCommunication, isBehavior, isBehaviorScheme, isStatePattern,
            isStrategyPattern, isNotifyGroup, isObserverPattern, isCommandPattern, isRelation,
            isDynamic, isDecoratorPattern, isAdapterPattern, isCorrect, isWrong;

    public static void main(String[] args) {
        startGame = new QuestionNode("Welcome to the game! Think of a design pattern and answer as yes or no. Ready?");
        isFlexible = new QuestionNode("Does it provide the object creation mechanism that enhances the flexibilities of the existing code?");
        isSingleInstance = new QuestionNode("Does it ensure you have at most one instance of a class in your application?");
        isSingletonPattern = new QuestionNode("Is it Singleton Pattern?");
        isBuilderPattern = new QuestionNode("Is it builder pattern?");
        isCommunication = new QuestionNode("Is it responsible for how one class communicates with other?");

        isBehavior = new QuestionNode("Does it provide a mechanism to the context to change its behavior?");
        isBehaviorScheme = new QuestionNode("Is changing behavior built into its scheme?");
        isNotifyGroup = new QuestionNode("Does it allow a group of objects to be notified when some state changes?");
        isStatePattern = new QuestionNode("Is it state pattern?");
        isStrategyPattern = new QuestionNode("Is it Strategy pattern?");
        isObserverPattern = new QuestionNode("Is it observer pattern?");
        isCommandPattern = new QuestionNode("Is it command pattern?");
        isRelation = new QuestionNode("Does it explain how to assemble objects and classes into a larger structure and simplifies structure by identifying the relationships?");
        isDynamic = new QuestionNode("Does it attach additional behavior to an object dynamically at run-time?");
        isDecoratorPattern = new QuestionNode("Is it decorator pattern?");
        isAdapterPattern = new QuestionNode("Is it adapter pattern?");
        isCorrect = new QuestionNode("Wohoo! I guessed it! Try again?");
        isWrong = new QuestionNode("Oops! Something went wrong! Try again?");

        startGame.SetYesQuestion(isFlexible);
        startGame.SetNoQuestion(isWrong);

        isCorrect.SetYesQuestion(startGame);
        isWrong.SetYesQuestion(startGame);

        isFlexible.SetYesQuestion(isSingleInstance);
        isFlexible.SetNoQuestion(isCommunication);

        isSingleInstance.SetYesQuestion(isSingletonPattern);
        isSingleInstance.SetNoQuestion(isBuilderPattern);

        isCommunication.SetYesQuestion(isBehavior);
        isCommunication.SetNoQuestion(isRelation);

        isBehavior.SetYesQuestion(isBehaviorScheme);
        isBehavior.SetNoQuestion(isNotifyGroup);

        isBehaviorScheme.SetYesQuestion(isStatePattern);
        isBehaviorScheme.SetNoQuestion(isStrategyPattern);

        isNotifyGroup.SetYesQuestion(isObserverPattern);
        isNotifyGroup.SetNoQuestion(isCommandPattern);

        isRelation.SetYesQuestion(isDynamic);
        isRelation.SetNoQuestion(isWrong);

        isDynamic.SetYesQuestion(isDecoratorPattern);
        isDynamic.SetNoQuestion(isAdapterPattern);

        SetLeafNode(isDecoratorPattern);
        SetLeafNode(isAdapterPattern);
        SetLeafNode(isObserverPattern);
        SetLeafNode(isCommandPattern);
        SetLeafNode(isStrategyPattern);
        SetLeafNode(isSingletonPattern);
        SetLeafNode(isStatePattern);
        GameTree gameTree = new GameTree(startGame);
gameTree.Start();
}
static void SetLeafNode(QuestionNode pattern){
pattern.SetYesQuestion(isCorrect);
pattern.SetNoQuestion(isWrong);
}
}
