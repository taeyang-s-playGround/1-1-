package day.commitBot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommitBotApplication

fun main(args: Array<String>) {
	runApplication<CommitBotApplication>(*args)
}
