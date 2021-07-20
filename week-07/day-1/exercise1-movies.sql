-- 1. Find the titles of all movies directed by Steven Spielberg.

select title
from movie
where director = 'Steven Spielberg';

-- 2. Find all years that have a movie that received a rating of 4 or 5, and sort them in increasing order.

select distinct year
from movie
         inner join rating r on movie.mID = r.mID
where r.stars between 4 and 5
order by year;

-- 3. Find the titles of all movies that have no ratings.

select title
from movie
         left join rating r on movie.mID = r.mID
where movie.mID not in (select mID from rating);

-- 4. Some reviewers didn't provide a date with their rating. Find the names of all reviewers who have ratings
-- with a NULL value for the date.

select name
from reviewer
         left join rating r on reviewer.rID = r.rID
where ratingDate IS NULL;

-- 5. For all pairs of reviewers such that both reviewers gave a rating to the same movie, return the names of
-- both reviewers. Eliminate duplicates, don't pair reviewers with themselves, and include each pair only once.
-- For each pair, return the names in the pair in alphabetical order.

select reviewer.name, movie.title, rating.stars, rating.ratingdate
from rating
         inner join movie
         join reviewer on rating.mID = movie.mID and rating.rID = reviewer.rID
order by name, title, stars;

-- 6. For all cases where the same reviewer rated the same movie twice and gave it a higher rating the second time,
-- return the reviewer's name and the title of the movie.

select reviewer.name, movie.title
from movie
         inner join rating r1 using (mID)
         inner join rating r2 using (rID, mID)
         inner join reviewer using (rID)
where r1.ratingDate < r2.ratingDate
  and r1.stars < r2.stars;

-- OPTIONAL--

-- 7. For each movie that has at least one rating, find the highest number of stars that movie received.
-- Return the movie title and number of stars. Sort by movie title.

select movie.title, max(rating.stars)
from movie
         inner join rating using (mID)
group by mID
order by title;

-- 8. For each movie, return the title and the ‘rating spread’, that is, the difference between highest and
-- lowest ratings given to that movie. Sort by rating spread from highest to lowest, then by movie title.

SELECT movie.title, max(rating.stars) - MIN(rating.stars) as ratingspread
from movie
         inner join rating on movie.mID = rating.mID
group by movie.mID
order by ratingspread desc, movie.title;

-- 9. Find the difference between the average rating of movies released before 1980 and the average rating of movies
-- released after 1980. (Make sure to calculate the average rating for each movie, then the average of those averages
-- for movies before 1980 and movies after. Don’t just calculate the overall average rating before and after 1980.)
