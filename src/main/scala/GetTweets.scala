import org.apache.log4j.Logger
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class  GetTweets {
  val obj = new Snippet
  val list=obj.getTweets
  val log = Logger.getLogger(this.getClass)

 def retrieveTweets (): Future[Boolean] =Future{
   val lst=list._1.toString
   log.info(lst)
   true
 }
  def countNumberOfTweets(): Future[Boolean] =Future{

    val count=list._1.size.toString
    log.info(count)

    true
  }
  def averageTweetsPerDay(): Future[Boolean] =Future{
    val map= list._1.groupBy(_.createdAt).mapValues{x=>x.size}.toString()
    log.info(map)
    true
  }
  def countNoOfRetweets():Future[Boolean] =Future{
  val retweets = list._2.map{tweet=>tweet.getRetweetCount()}
    log.info(retweets.sum.toString)
    true

  }
  def countNoOfLikes():Future[Boolean] =Future{
    val likes = list._2.map{tweet=>tweet.getFavoriteCount()}
    log.info(likes.sum.toString)
    true

  }

}
