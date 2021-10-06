
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (1, 13, '2010-11-02', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (2, 18, '2021-11-02', 'New_Release', 15) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (7, 18, '2021-11-02', 'New_Release', 15) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (13, 18, '2021-11-02', 'New_Release', 15) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (3, 18, '2015-04-05', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (4, 18, '2014-04-05', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (5, 13, '2012-04-05', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (6, 18, '2012-05-05', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (8, 18, '2017-12-05', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (9, 13, '2002-05-05', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (10, 13, '2009-05-05', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (11, 13, '2010-05-05', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (12, 18, '2012-05-08', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (14, 18, '2008-07-02', 'Regular_Movie', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.videotype (id, max_age, release_year, type, type_rate) VALUES (15, 13, '2018-08-02', 'Children_Movie', 8) ON CONFLICT (id) DO NOTHING;


INSERT INTO public.video (id, title, video_genre, video_type) VALUES (1, 'Omo Ghetto', 'Action', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (2, 'Quam’s Money', 'Romance', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (3, 'Still Fallin', 'Horror', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (4, 'Day of Destiny', 'Drama', 4) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (5, 'Fine Wine', 'Action', 5) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (6, 'Wonder Woman', 'Romance', 6) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (7, 'Godzilla V Kong', 'Comedy', 7) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (8, 'Raya', 'Drama', 8) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (9, 'Legend of Inikp', 'Horror', 9) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (10, 'Nneka the Pretty Serpant', 'Comedy', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (11, 'Introducing the Kujus', 'Romance', 11) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (12, 'Small Chops', 'Drama', 12) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (13, 'Who’s the boss', 'Action', 13) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (14, 'Fate of Alakada', 'Romance', 14) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.video (id, title, video_genre, video_type) VALUES (15, 'A Good Man', 'Drama', 15) ON CONFLICT (id) DO NOTHING;