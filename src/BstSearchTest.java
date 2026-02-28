import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void testContains_FindsExistingValue() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(15);
        root.left.left = new BinaryTreeNode<>(2);
        root.left.right = new BinaryTreeNode<>(7);

        assertTrue(BstSearch.contains(root, 7));
        assertTrue(BstSearch.contains(root, 10));
        assertTrue(BstSearch.contains(root, 2));
        assertTrue(BstSearch.contains(root, 15));
        
    }

}
