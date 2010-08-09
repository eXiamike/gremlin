package com.tinkerpop.gremlin.compiler.functions.g;

import com.tinkerpop.gremlin.compiler.functions.AbstractFunctions;
import com.tinkerpop.gremlin.compiler.functions.g.bool.BooleanFunction;
import com.tinkerpop.gremlin.compiler.functions.g.bool.NotFunction;
import com.tinkerpop.gremlin.compiler.functions.g.graph.*;
import com.tinkerpop.gremlin.compiler.functions.g.io.PrintFunction;
import com.tinkerpop.gremlin.compiler.functions.g.lme.*;
import com.tinkerpop.gremlin.compiler.functions.g.number.*;
import com.tinkerpop.gremlin.compiler.functions.g.string.*;
import com.tinkerpop.gremlin.compiler.functions.g.util.*;

/**
 * @author Pavel A. Yaskevich
 */
public class GremlinFunctions extends AbstractFunctions {

    private static final String NAMESPACE = "g";

    public GremlinFunctions() {
        // bool
        functions.add(new BooleanFunction());
        functions.add(new NotFunction());
        // graph
        functions.add(new AddEdgeFunction());
        functions.add(new AddIndexFunction());
        functions.add(new AddVertexFunction());
        functions.add(new ClearFunction());
        functions.add(new CloseFunction());
        functions.add(new IdEdgeFunction());
        functions.add(new IdVertexFunction());
        functions.add(new IndexAllFunction());
        functions.add(new KeyVertexFunction());
        functions.add(new LoadFunction());
        functions.add(new RemoveIndexFunction());
        functions.add(new RemoveVertexEdgeFunction());
        functions.add(new SaveFunction());
        // io
        functions.add(new PrintFunction());
        // lme
        functions.add(new DeduplicateFunction());
        functions.add(new DifferenceFunction());
        functions.add(new ExceptFunction());
        functions.add(new GetFunction());
        functions.add(new GroupFunction());
        functions.add(new IntersectFunction());
        functions.add(new ListFunction());
        functions.add(new MapFunction());
        functions.add(new OperateValueFunction());
        functions.add(new RetainFunction());
        //functions.add(new SetFunction());
        functions.add(new SortFunction());
        functions.add(new UnionFunction());
        functions.add(new ValuesFunction());
        // number
        functions.add(new CeilingFunction());
        functions.add(new CountFunction());
        functions.add(new DoubleFunction());
        functions.add(new FloatFunction());
        functions.add(new FloorFunction());
        functions.add(new IntegerFunction());
        functions.add(new LongFunction());
        functions.add(new RandomNaturalFunction());
        functions.add(new RandomRealFunction());
        functions.add(new SumFunction());
        functions.add(new RoundFunction());
        // string
        functions.add(new ConcatFunction());
        functions.add(new ContainsFunction());
        functions.add(new MatchesFunction());
        functions.add(new NormalizeSpaceFunction());
        functions.add(new ReplaceFunction());
        functions.add(new StartsWithFunction());
        functions.add(new StringFunction());
        functions.add(new StringLengthFunction());
        functions.add(new SubstringAfterFunction());
        functions.add(new SubstringBeforeFunction());
        functions.add(new SubstringFunction());
        functions.add(new TranslateFunction());
        // util
        functions.add(new AssignFunction());
        functions.add(new FromJsonFunction());
        functions.add(new PathFunction());
        functions.add(new TimeFunction());
        functions.add(new ToJsonFunction());
        functions.add(new TypeFunction());
        functions.add(new UnassignFunction());
        functions.add(new VersionFunction());
    }

    public String getNamespace() {
        return NAMESPACE;
    }


}
