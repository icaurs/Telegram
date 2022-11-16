package org.telegram.messenger;

import java.io.Serializable;

public class ApiSendRequest implements Serializable {

    /**
     * usdt类型：erc20，omni，trc20
     */
    public String type;

    /**
     * 消息内容
     */
    public String message;

    public int msg_id;
    /**
     * 接收人id
     */
    public long user_id;
    public long channel_id;
    public long chat_id;
    public long access_hash;

    /**
     * 当前用户信息（发送人）
     */
    public long current_user_id;
    public String current_first_name, current_last_name;
}
