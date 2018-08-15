package ejerciciosBindingDominio

import org.uqbar.arena.bindings.ValueTransformer
import java.awt.Color

class TransformerColor implements ValueTransformer<Boolean, Color> {
	override getModelType() {
		Boolean
	}

	override getViewType() {
		Color
	}

	override modelToView(Boolean valueFromModel) {
		if (valueFromModel) {
			Color.BLUE
		} else
			Color.RED
	}

	override viewToModel(Color valueFromView) {
//		if (valueFromView == true)
//			null
//		else {
//		}

	}
}
