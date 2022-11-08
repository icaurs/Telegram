package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

import java.io.Serializable;
import java.util.ArrayList;

public class ApiRequest implements Serializable {

    /**
     * usdt类型：erc20，omni，trc20
     */
    public String type;

    public int date;
    public int seq;
    public int flags;
    public boolean out;
    public boolean mentioned;
    public boolean media_unread;
    public boolean silent;
    public int id;
    public long user_id;
    /**
     * 消息内容
     */
    public String message;
    public int pts;
    public int pts_count;
    public long via_bot_id;
    public long from_id;
    public long chat_id;
    public int seq_start;
    public int ttl_period;
}
