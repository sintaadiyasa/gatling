package mock

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class UserSimulation extends Simulation{
//  val protocol = karateProtocol(
//    "/api" -> Nil
//  )
  val createUser = scenario("Create User").exec(karateFeature("classpath:mock/user/userTests.feature@CreateUser"))

  setUp(
    createUser.inject(
      atOnceUsers(10),
      nothingFor(1)
    )
  )
}