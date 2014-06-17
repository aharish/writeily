package com.jmartin.writeily.model;

/**
 * Created by jeff on 2014-04-11.
 */
public class Constants {
    public static final String WRITEILY_EXT = ".writeily";
    public static final String TXT_EXT = ".txt";
    public static final String MD_EXT = ".md";
    public static final String MARKDOWN_EXT = ".markdown";
    public static final String MDOWN_EXT = ".mdown";

    public static final String MD_PREVIEW_KEY = "md_preview_key";
    public static final String UTF_CHARSET = "utf-8";

    public static final String SHARE_DIALOG_TAG = "share_dialog_tag";
    public static final String SHARE_BROADCAST_TAG = "share_broadcast_tag";
    public static final String BROADCAST_EXTRA = "broadcast_extra";
    public static final String SHARE_TYPE_TAG = "share_type_tag";
    public static final int MAX_TITLE_LENGTH = 25;
    public static String NOTE_KEY = "note_key";

    // ----- SHARE INT ENUMERATIONS -----
    public static final int SHARE_TXT_TYPE = 0;
    public static final int SHARE_HTML_TYPE = 1;

    // ----- HTML PREFIX AND SUFFIXES -----
    public static final String UNSTYLED_HTML_PREFIX = "<html><body>";
    public static final String MD_HTML_PREFIX = "<html><head><style type=\"text/css\">html,body{padding:4px 8px 4px 8px;font-family:'sans-serif-light';color:#303030}h1,h2,h3,h4,h5,h6{font-family:'sans-serif-condensed';}a{color:#0099ff;text-decoration:underline;}}</style></head><body>";
    public static final String DARK_MD_HTML_PREFIX = "<html><head><style type=\"text/css\">html,body{padding:4px 8px 4px 8px;font-family:'sans-serif-light';color:#ffffff;background-color:#303030}h1,h2,h3,h4,h5,h6{font-family:'sans-serif-condensed';}a{color:#ffffff;text-decoration:underline;}a:visited{color:#dddddd}}</style></head><body>";
    public static final String MD_HTML_SUFFIX = "</body></html>";
}
