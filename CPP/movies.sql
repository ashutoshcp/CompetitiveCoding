Movie Database (   movies (id, name),  

actors (id, email, name),    
directors => (id, email, name)    
reviewers => (id, email, name) 

movie_casts => (actor_id, movie_id, cast)   [movie join actors]

movie_directions => (movie_id, director_id)   [movie join directors]]
movie_reviews => (movie_id, reviewer_id, rating (1-5 points)) )  
*rating of movie => Average of movie_reviews rating.


1. How many movies with rating above 4 was done by actor x and director y ,
 *rating of movie will be considered only if has alteast 100 reviews.

select count(distinct(movie_reviews.movie_id)) 
from movie_reviews join movie_casts on movie_reviews.movie_id = movie_casts.movie_id on 
movie_reviews join movie_directions on movie_reviews.movie_id = movie_directions.movie_id
where movie_casts.actor_id = 'x' and movie_directions.director_id = 'y'
group by movie_reviews.movie_id 
having count(movie_reviews.movie_id)>100 and (sum(movie_reviews.rating) / count(movie_reviews.movie_id) > 4);
