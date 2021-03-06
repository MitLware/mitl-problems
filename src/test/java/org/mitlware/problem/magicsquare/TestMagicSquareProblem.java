package org.mitlware.problem.magicsquare;

import org.junit.Test;
import org.mitlware.mutable.Evaluate;
import org.mitlware.solution.permutation.ArrayForm;

import static org.junit.Assert.assertEquals;

public final class TestMagicSquareProblem {

	@Test
	public void testEvaluateUnconstrainedProblem() {
		Evaluate.Directional< ArrayForm, Integer > f = new MagicSquareProblem.UnconstrainedProblem(3);		
		ArrayForm s = new ArrayForm(9);
		assertEquals( 24, f.apply( s ), 0 );
	}

	///////////////////////////////
	
	@Test
	public void testEvaluateConstrainedProblem() {
		Evaluate.Directional< ArrayForm, Integer > f = new MagicSquareProblem.ConstrainedProblem(4,0,1,10);
		ArrayForm s = new ArrayForm(16);
		assertEquals( 170, f.apply( s ), 0 );
	}
}

// End ///////////////////////////////////////////////////////////////
