package kz.iitu.quizmidterm1and2andfinalexamtest

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<QuizMidTerm1and2andFinalExamTestApplication>().with(TestcontainersConfiguration::class).run(*args)
}
