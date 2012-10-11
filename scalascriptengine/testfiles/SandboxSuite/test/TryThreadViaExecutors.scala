package test

import com.googlecode.scalascriptengine.TestClassTrait
import java.util.concurrent._

class TryThreadViaExecutors extends TestClassTrait {
	def result = {
		val e = Executors.newSingleThreadExecutor
		e.submit(
			new Runnable {
				override def run = {
					println("hacked!")
				}
			}
		)
		Thread.sleep(100)
		"hacked!"
	}
}
