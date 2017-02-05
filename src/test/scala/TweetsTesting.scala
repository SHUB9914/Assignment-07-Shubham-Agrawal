
import org.scalatest.FunSuite
import scala.concurrent.Await
import scala.concurrent.duration._

class TweetsTesting extends FunSuite {

  val obj = new GetTweets
  test("retrieveTweets") {
       assert(Await.result(obj.retrieveTweets(),10.second))
  }

  test("countNumberOfTweets") {
       assert(Await.result(obj.countNumberOfTweets(),10.second))
  }

  test("averageTweetsPerDay") {
       assert(Await.result(obj.averageTweetsPerDay(),10.second))
  }
  test("total Retweets") {
       assert(Await.result(obj.countNoOfRetweets(),10.second))
  }
  test("total Likes") {
       assert(Await.result(obj.countNoOfLikes(),10.second))
  }


}
