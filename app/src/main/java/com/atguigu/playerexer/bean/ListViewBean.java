package com.atguigu.playerexer.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/5/30.
 */

public class ListViewBean {




    private InfoBean info;
    private List<ListBean> list;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class InfoBean {
        /**
         * count : 4352
         * np : 1496061002
         */

        private int count;
        private int np;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNp() {
            return np;
        }

        public void setNp(int np) {
            this.np = np;
        }
    }

    public static class ListBean {
        /**
         * status : 4
         * comment : 78
         * top_comments : [{"voicetime":0,"status":0,"hate_count":0,"cmt_type":"text","precid":0,"content":"前面说肉松是棉花那个，已经进去了！兄弟我看到你","like_count":47,"u":{"header":["http://wimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg"],"uid":"18484312","is_vip":false,"room_url":"","sex":"m","room_name":"","room_role":"","room_icon":"","name":"余小多"},"preuid":0,"passtime":"2017-05-29 19:17:07","voiceuri":"","id":81263203}]
         * tags : [{"id":1,"name":"搞笑"},{"id":60,"name":"吐槽"},{"id":64,"name":"糗事"}]
         * bookmark : 17
         * text : 【啤酒也造假】网曝百威啤酒制假过程，这环境…无任何卫生防护措施，我怀疑我是不是喝了很多假百威。
         * gif : {"images":["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b.gif","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b.gif"],"width":210,"gif_thumbnail":["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg"],"download_url":["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_d.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_d.jpg","http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg"],"height":277}
         * up : 348
         * share_url : http://a.f.budejie.com/share/25160018.html?wx.qq.com
         * down : 25
         * forward : 75
         * u : {"header":["http://wimg.spriteapp.cn/profile/large/2017/05/25/5926f5b2cef7b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2017/05/25/5926f5b2cef7b_mini.jpg"],"uid":"20060906","is_vip":false,"is_v":false,"room_url":"","room_name":"笑公馆V","room_role":"帮主","room_icon":"http://wimg.spriteapp.cn/ugc/2016/1101/gang_level_6.png","name":"笑公馆 [笑公馆V]"}
         * passtime : 2017-05-29 23:52:01
         * type : gif
         * id : 25160018
         * video : {"playfcount":995,"height":640,"width":426,"video":["http://wvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4","http://dvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4"],"download":["http://wvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4","http://dvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4"],"duration":70,"playcount":31085,"thumbnail":["http://wimg.spriteapp.cn/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg","http://dimg.spriteapp.cn/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg"],"thumbnail_small":["http://wimg.spriteapp.cn/crop/150x150/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg"]}
         * image : {"medium":[],"big":["http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_1.jpg"],"download_url":["http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_d.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_d.jpg","http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b.jpg"],"height":1443,"width":750,"small":[],"thumbnail_small":["http://wimg.spriteapp.cn/crop/150x150/ugc/2017/05/29/592afc51b578b.jpg","http://dimg.spriteapp.cn/crop/150x150/ugc/2017/05/29/592afc51b578b.jpg"]}
         * vote : [{"name":"小伙子真该打啊","vid":62277,"vote_num":252},{"name":"我貌似看到什么不该看的什么？","vid":62278,"vote_num":3146},{"name":"小姑娘真是喜欢重口味啊","vid":62279,"vote_num":303}]
         * top_comment : {"voicetime":0,"status":0,"hate_count":0,"cmt_type":"text","precid":0,"content":"平心而论，你得负责🤔","like_count":279,"u":{"header":["http://wimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg"],"uid":"20818245","is_vip":false,"room_url":"","sex":"m","room_name":"","room_role":"","room_icon":"","name":"四十米长的刀"},"preuid":0,"passtime":"2017-05-28 20:54:19","voiceuri":"","id":81202106}
         */

        private int status;
        private String comment;
        private String bookmark;
        private String text;
        private GifBean gif;
        private String up;
        private String share_url;
        private int down;
        private int forward;
        private UBean u;
        private String passtime;
        private String type;
        private String id;
        private VideoBean video;
        private ImageBean image;
        private TopCommentBean top_comment;
        private List<TopCommentsBean> top_comments;
        private List<TagsBean> tags;
        private List<VoteBean> vote;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getBookmark() {
            return bookmark;
        }

        public void setBookmark(String bookmark) {
            this.bookmark = bookmark;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public GifBean getGif() {
            return gif;
        }

        public void setGif(GifBean gif) {
            this.gif = gif;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getShare_url() {
            return share_url;
        }

        public void setShare_url(String share_url) {
            this.share_url = share_url;
        }

        public int getDown() {
            return down;
        }

        public void setDown(int down) {
            this.down = down;
        }

        public int getForward() {
            return forward;
        }

        public void setForward(int forward) {
            this.forward = forward;
        }

        public UBean getU() {
            return u;
        }

        public void setU(UBean u) {
            this.u = u;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public VideoBean getVideo() {
            return video;
        }

        public void setVideo(VideoBean video) {
            this.video = video;
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public TopCommentBean getTop_comment() {
            return top_comment;
        }

        public void setTop_comment(TopCommentBean top_comment) {
            this.top_comment = top_comment;
        }

        public List<TopCommentsBean> getTop_comments() {
            return top_comments;
        }

        public void setTop_comments(List<TopCommentsBean> top_comments) {
            this.top_comments = top_comments;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<VoteBean> getVote() {
            return vote;
        }

        public void setVote(List<VoteBean> vote) {
            this.vote = vote;
        }

        public static class GifBean {
            /**
             * images : ["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b.gif","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b.gif"]
             * width : 210
             * gif_thumbnail : ["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg"]
             * download_url : ["http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_d.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_d.jpg","http://wimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592bec4a6083b_a_1.jpg"]
             * height : 277
             */

            private int width;
            private int height;
            private List<String> images;
            private List<String> gif_thumbnail;
            private List<String> download_url;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public List<String> getImages() {
                return images;
            }

            public void setImages(List<String> images) {
                this.images = images;
            }

            public List<String> getGif_thumbnail() {
                return gif_thumbnail;
            }

            public void setGif_thumbnail(List<String> gif_thumbnail) {
                this.gif_thumbnail = gif_thumbnail;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }
        }

        public static class UBean {
            /**
             * header : ["http://wimg.spriteapp.cn/profile/large/2017/05/25/5926f5b2cef7b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2017/05/25/5926f5b2cef7b_mini.jpg"]
             * uid : 20060906
             * is_vip : false
             * is_v : false
             * room_url :
             * room_name : 笑公馆V
             * room_role : 帮主
             * room_icon : http://wimg.spriteapp.cn/ugc/2016/1101/gang_level_6.png
             * name : 笑公馆 [笑公馆V]
             */

            private String uid;
            private boolean is_vip;
            private boolean is_v;
            private String room_url;
            private String room_name;
            private String room_role;
            private String room_icon;
            private String name;
            private List<String> header;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public boolean isIs_vip() {
                return is_vip;
            }

            public void setIs_vip(boolean is_vip) {
                this.is_vip = is_vip;
            }

            public boolean isIs_v() {
                return is_v;
            }

            public void setIs_v(boolean is_v) {
                this.is_v = is_v;
            }

            public String getRoom_url() {
                return room_url;
            }

            public void setRoom_url(String room_url) {
                this.room_url = room_url;
            }

            public String getRoom_name() {
                return room_name;
            }

            public void setRoom_name(String room_name) {
                this.room_name = room_name;
            }

            public String getRoom_role() {
                return room_role;
            }

            public void setRoom_role(String room_role) {
                this.room_role = room_role;
            }

            public String getRoom_icon() {
                return room_icon;
            }

            public void setRoom_icon(String room_icon) {
                this.room_icon = room_icon;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<String> getHeader() {
                return header;
            }

            public void setHeader(List<String> header) {
                this.header = header;
            }
        }

        public static class VideoBean {
            /**
             * playfcount : 995
             * height : 640
             * width : 426
             * video : ["http://wvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4","http://dvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4"]
             * download : ["http://wvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4","http://dvideo.spriteapp.cn/video/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.mp4"]
             * duration : 70
             * playcount : 31085
             * thumbnail : ["http://wimg.spriteapp.cn/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg","http://dimg.spriteapp.cn/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg"]
             * thumbnail_small : ["http://wimg.spriteapp.cn/crop/150x150/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg","http://dimg.spriteapp.cn/crop/150x150/picture/2017/0527/b3ec3c10-42ec-11e7-90ba-90b11c479401_wpd.jpg"]
             */

            private int playfcount;
            private int height;
            private int width;
            private int duration;
            private int playcount;
            private List<String> video;
            private List<String> download;
            private List<String> thumbnail;
            private List<String> thumbnail_small;

            public int getPlayfcount() {
                return playfcount;
            }

            public void setPlayfcount(int playfcount) {
                this.playfcount = playfcount;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getPlaycount() {
                return playcount;
            }

            public void setPlaycount(int playcount) {
                this.playcount = playcount;
            }

            public List<String> getVideo() {
                return video;
            }

            public void setVideo(List<String> video) {
                this.video = video;
            }

            public List<String> getDownload() {
                return download;
            }

            public void setDownload(List<String> download) {
                this.download = download;
            }

            public List<String> getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(List<String> thumbnail) {
                this.thumbnail = thumbnail;
            }

            public List<String> getThumbnail_small() {
                return thumbnail_small;
            }

            public void setThumbnail_small(List<String> thumbnail_small) {
                this.thumbnail_small = thumbnail_small;
            }
        }

        public static class ImageBean {
            /**
             * medium : []
             * big : ["http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_1.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_1.jpg"]
             * download_url : ["http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_d.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b_d.jpg","http://wimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b.jpg","http://dimg.spriteapp.cn/ugc/2017/05/29/592afc51b578b.jpg"]
             * height : 1443
             * width : 750
             * small : []
             * thumbnail_small : ["http://wimg.spriteapp.cn/crop/150x150/ugc/2017/05/29/592afc51b578b.jpg","http://dimg.spriteapp.cn/crop/150x150/ugc/2017/05/29/592afc51b578b.jpg"]
             */

            private int height;
            private int width;
            private List<?> medium;
            private List<String> big;
            private List<String> download_url;
            private List<?> small;
            private List<String> thumbnail_small;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<?> getMedium() {
                return medium;
            }

            public void setMedium(List<?> medium) {
                this.medium = medium;
            }

            public List<String> getBig() {
                return big;
            }

            public void setBig(List<String> big) {
                this.big = big;
            }

            public List<String> getDownload_url() {
                return download_url;
            }

            public void setDownload_url(List<String> download_url) {
                this.download_url = download_url;
            }

            public List<?> getSmall() {
                return small;
            }

            public void setSmall(List<?> small) {
                this.small = small;
            }

            public List<String> getThumbnail_small() {
                return thumbnail_small;
            }

            public void setThumbnail_small(List<String> thumbnail_small) {
                this.thumbnail_small = thumbnail_small;
            }
        }

        public static class TopCommentBean {
            /**
             * voicetime : 0
             * status : 0
             * hate_count : 0
             * cmt_type : text
             * precid : 0
             * content : 平心而论，你得负责🤔
             * like_count : 279
             * u : {"header":["http://wimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg"],"uid":"20818245","is_vip":false,"room_url":"","sex":"m","room_name":"","room_role":"","room_icon":"","name":"四十米长的刀"}
             * preuid : 0
             * passtime : 2017-05-28 20:54:19
             * voiceuri :
             * id : 81202106
             */

            private int voicetime;
            private int status;
            private int hate_count;
            private String cmt_type;
            private int precid;
            private String content;
            private int like_count;
            private UBeanX u;
            private int preuid;
            private String passtime;
            private String voiceuri;
            private int id;

            public int getVoicetime() {
                return voicetime;
            }

            public void setVoicetime(int voicetime) {
                this.voicetime = voicetime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getHate_count() {
                return hate_count;
            }

            public void setHate_count(int hate_count) {
                this.hate_count = hate_count;
            }

            public String getCmt_type() {
                return cmt_type;
            }

            public void setCmt_type(String cmt_type) {
                this.cmt_type = cmt_type;
            }

            public int getPrecid() {
                return precid;
            }

            public void setPrecid(int precid) {
                this.precid = precid;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public UBeanX getU() {
                return u;
            }

            public void setU(UBeanX u) {
                this.u = u;
            }

            public int getPreuid() {
                return preuid;
            }

            public void setPreuid(int preuid) {
                this.preuid = preuid;
            }

            public String getPasstime() {
                return passtime;
            }

            public void setPasstime(String passtime) {
                this.passtime = passtime;
            }

            public String getVoiceuri() {
                return voiceuri;
            }

            public void setVoiceuri(String voiceuri) {
                this.voiceuri = voiceuri;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public static class UBeanX {
                /**
                 * header : ["http://wimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2017/05/25/592698641cb7b_mini.jpg"]
                 * uid : 20818245
                 * is_vip : false
                 * room_url :
                 * sex : m
                 * room_name :
                 * room_role :
                 * room_icon :
                 * name : 四十米长的刀
                 */

                private String uid;
                private boolean is_vip;
                private String room_url;
                private String sex;
                private String room_name;
                private String room_role;
                private String room_icon;
                private String name;
                private List<String> header;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public boolean isIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(boolean is_vip) {
                    this.is_vip = is_vip;
                }

                public String getRoom_url() {
                    return room_url;
                }

                public void setRoom_url(String room_url) {
                    this.room_url = room_url;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getRoom_name() {
                    return room_name;
                }

                public void setRoom_name(String room_name) {
                    this.room_name = room_name;
                }

                public String getRoom_role() {
                    return room_role;
                }

                public void setRoom_role(String room_role) {
                    this.room_role = room_role;
                }

                public String getRoom_icon() {
                    return room_icon;
                }

                public void setRoom_icon(String room_icon) {
                    this.room_icon = room_icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<String> getHeader() {
                    return header;
                }

                public void setHeader(List<String> header) {
                    this.header = header;
                }
            }
        }

        public static class TopCommentsBean {
            /**
             * voicetime : 0
             * status : 0
             * hate_count : 0
             * cmt_type : text
             * precid : 0
             * content : 前面说肉松是棉花那个，已经进去了！兄弟我看到你
             * like_count : 47
             * u : {"header":["http://wimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg"],"uid":"18484312","is_vip":false,"room_url":"","sex":"m","room_name":"","room_role":"","room_icon":"","name":"余小多"}
             * preuid : 0
             * passtime : 2017-05-29 19:17:07
             * voiceuri :
             * id : 81263203
             */

            private int voicetime;
            private int status;
            private int hate_count;
            private String cmt_type;
            private int precid;
            private String content;
            private int like_count;
            private UBeanXX u;
            private int preuid;
            private String passtime;
            private String voiceuri;
            private int id;

            public int getVoicetime() {
                return voicetime;
            }

            public void setVoicetime(int voicetime) {
                this.voicetime = voicetime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getHate_count() {
                return hate_count;
            }

            public void setHate_count(int hate_count) {
                this.hate_count = hate_count;
            }

            public String getCmt_type() {
                return cmt_type;
            }

            public void setCmt_type(String cmt_type) {
                this.cmt_type = cmt_type;
            }

            public int getPrecid() {
                return precid;
            }

            public void setPrecid(int precid) {
                this.precid = precid;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public UBeanXX getU() {
                return u;
            }

            public void setU(UBeanXX u) {
                this.u = u;
            }

            public int getPreuid() {
                return preuid;
            }

            public void setPreuid(int preuid) {
                this.preuid = preuid;
            }

            public String getPasstime() {
                return passtime;
            }

            public void setPasstime(String passtime) {
                this.passtime = passtime;
            }

            public String getVoiceuri() {
                return voiceuri;
            }

            public void setVoiceuri(String voiceuri) {
                this.voiceuri = voiceuri;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public static class UBeanXX {
                /**
                 * header : ["http://wimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg","http://dimg.spriteapp.cn/profile/large/2016/06/27/5770ca39b3e8b_mini.jpg"]
                 * uid : 18484312
                 * is_vip : false
                 * room_url :
                 * sex : m
                 * room_name :
                 * room_role :
                 * room_icon :
                 * name : 余小多
                 */

                private String uid;
                private boolean is_vip;
                private String room_url;
                private String sex;
                private String room_name;
                private String room_role;
                private String room_icon;
                private String name;
                private List<String> header;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public boolean isIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(boolean is_vip) {
                    this.is_vip = is_vip;
                }

                public String getRoom_url() {
                    return room_url;
                }

                public void setRoom_url(String room_url) {
                    this.room_url = room_url;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public String getRoom_name() {
                    return room_name;
                }

                public void setRoom_name(String room_name) {
                    this.room_name = room_name;
                }

                public String getRoom_role() {
                    return room_role;
                }

                public void setRoom_role(String room_role) {
                    this.room_role = room_role;
                }

                public String getRoom_icon() {
                    return room_icon;
                }

                public void setRoom_icon(String room_icon) {
                    this.room_icon = room_icon;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<String> getHeader() {
                    return header;
                }

                public void setHeader(List<String> header) {
                    this.header = header;
                }
            }
        }

        public static class TagsBean {
            /**
             * id : 1
             * name : 搞笑
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class VoteBean {
            /**
             * name : 小伙子真该打啊
             * vid : 62277
             * vote_num : 252
             */

            private String name;
            private int vid;
            private int vote_num;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getVid() {
                return vid;
            }

            public void setVid(int vid) {
                this.vid = vid;
            }

            public int getVote_num() {
                return vote_num;
            }

            public void setVote_num(int vote_num) {
                this.vote_num = vote_num;
            }
        }
    }
}
