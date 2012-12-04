import cucumber.api.groovy.EN
import static org.junit.Assert.*;
import cucumber.api.groovy.Hooks

Hooks.Before() {
	calculator = new Calculator()
}

EN.When(~'^I add "(\\d)" and "(\\d)"$') { int number1, int number2 ->
	result = calculator.add number1, number2
}

EN.When(~'^I subtract "(\\d)" from "(\\d)"$') { int number1, int number2 ->
	result = calculator.sub number2, number1
}
EN.Then(~'^the result should be "(\\d)"$') { int actualResult ->
	assertEquals result, actualResult
}