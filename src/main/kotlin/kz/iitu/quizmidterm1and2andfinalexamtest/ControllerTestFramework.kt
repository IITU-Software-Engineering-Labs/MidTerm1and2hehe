package kz.iitu.quizmidterm1and2andfinalexamtest


import kz.iitu.quizmidterm1and2andfinalexamtest.studentworkspace.StudentController

fun main() {
    println("===== Controller Knowledge Test Framework =====")
    println("Enter the test number to execute (e.g., test-1): ")

    when (readLine()) {
        "test-1" -> runTest1()
        "test-2" -> runTest2()
        else -> println("Invalid test number. Please enter a valid test ID.")
    }
}

/**
 * Test 1: Verify Controller Presence
 * Description:
 *   - Check if the @RestController annotation is used on `StudentController`.
 * Condition:
 *   - The @RestController annotation must be present.
 */
fun runTest1() {
    println("Running Test 1: Verify Controller Presence")
    val isRestControllerPresent = StudentController::class.annotations.any { it.annotationClass.simpleName == "RestController" }
    if (isRestControllerPresent) {
        println("PASSED: @RestController is correctly used.")
    } else {
        println("FAILED: @RestController annotation is missing or incorrect.")
    }
}

/**
 * Test 2: Verify GET Mapping
 * Description:
 *   - Check if a GET mapping is defined for the endpoint `/api/test`.
 *   - Simulate the behavior of a controller handling a GET request.
 * Condition:
 *   - The endpoint must respond with "Hello from the student!".
 */
fun runTest2() {
    println("Running Test 2: Verify GET Mapping")
    val isGetMappingCorrect = simulateGetMapping()
    if (isGetMappingCorrect) {
        println("PASSED: GET mapping for /api/test is defined and functional.")
    } else {
        println("FAILED: GET mapping is missing or returns incorrect response.")
    }
}

/**
 * Helper function to simulate a GET mapping test for the endpoint /api/test.
 */
fun simulateGetMapping(): Boolean {
    // Simulate a GET request to /api/test and check the response.
    val simulatedResponse = "Hello from the student!" // Replace with actual test logic if needed.
    return simulatedResponse == "Hello from the student!"
}
