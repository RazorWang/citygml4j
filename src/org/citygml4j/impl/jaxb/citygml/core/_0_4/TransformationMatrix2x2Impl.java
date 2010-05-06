package org.citygml4j.impl.jaxb.citygml.core._0_4;

import java.util.List;

import org.citygml4j.geometry.Matrix;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.core.CoreModule;
import org.citygml4j.model.citygml.core.TransformationMatrix2x2;

public class TransformationMatrix2x2Impl implements TransformationMatrix2x2 {
	private Matrix matrix;

	public TransformationMatrix2x2Impl() {
		matrix = new Matrix(2, 2);
	}

	public TransformationMatrix2x2Impl(Matrix matrix) {
		if (matrix.getRowDimension() != 2 || matrix.getColumnDimension() != 2)
			throw new IllegalArgumentException("Matrix dimensions must be 2x2.");
		
		this.matrix = matrix;
	}

	public TransformationMatrix2x2Impl(List<Double> vals) {
		if (vals.size() != 4)
			throw new IllegalArgumentException("List size must be 4.");

		matrix = new Matrix(2, 2);
		matrix.setMatrix(vals);
	}

	public Matrix getMatrix() {
		return matrix;
	}

	public void setMatrix(Matrix matrix) {
		if (matrix.getRowDimension() != 2 || matrix.getColumnDimension() != 2)
			throw new IllegalArgumentException("Matrix dimensions must be 2x2.");
		
		this.matrix = matrix;
	}

	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.TRANSFORMATIONMATRIX2X2;
	}

	public final CityGMLModule getCityGMLModule() {
		return CoreModule.v0_4_0;
	}
}