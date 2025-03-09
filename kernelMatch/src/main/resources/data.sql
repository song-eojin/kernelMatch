insert into user (name, password, email, phone, role) 
	values ('송어진', 'eojin1234', 'eojin2222@naver.com', '010-6330-8451', 'ADMIN');
insert into user (name, password, email, phone) 
	values ('오승택', 'tack1234', 'tack1234@naver.com', '010-1111-2222');
    
INSERT INTO post (title, content, user_id) 
VALUES 
    ('첫 번째 게시물', '이것은 첫 번째 게시물의 내용입니다.', 1),   -- user_id 1번 사용자
    ('두 번째 게시물', '두 번째 게시물의 내용이 여기 있습니다.', 2),  -- user_id 2번 사용자
    ('세 번째 게시물', '세 번째 게시물 내용이 여기 있어요.', 1);    -- user_id 1번 사용자
    
use kernelMatch;
select * from user;
select * from post;