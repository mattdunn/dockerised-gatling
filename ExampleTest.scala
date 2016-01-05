package default

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ExampleTest extends Simulation {

	val httpProtocol = http
		.baseURL("http://google.com")

	val user = scenario("Example-Test").exec(Example.search)

	object Example {
		val search = exec(http("Get-Google")
				.get("/")
				.check(status.is(200)))
	}

	setUp(
		user.inject(rampUsers(2) over (1 minutes))
	).protocols(httpProtocol)
}
