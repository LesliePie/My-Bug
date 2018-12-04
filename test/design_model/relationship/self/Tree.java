package design_model.relationship.self;

import java.util.List;

/**
 * @program: oprate-AliYun
 * @description: 我们常用的树
 * @author: Leslie
 * @create: 2018-12-03 17:55
 **/
public class Tree {
    /**
     * 树的子类下面都是树
     */
    private String nodeName;
    private List<Tree> children;
}
