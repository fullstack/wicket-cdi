/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ftlines.wicket.cdi;

import javax.enterprise.context.ConversationScoped;

/**
 * Various modes of propagating persistent conversations across requests.
 * 
 * @see ConversationScoped
 * 
 * @author igor
 */
public enum ConversationPropagation {
	/** No conversational propagation takes place */
	NONE(true),
	/**
	 * Pesistent conversations are propagated between non-bookmarkable pages only
	 */
	NONBOOKMARKABLE(true),
	/**
	 * Persistent conversations are propagated between bookmarkable and non-bookmarkable pages
	 */
	ALL(false);

	private boolean supportsPropagationMarkerRemoval;

	private ConversationPropagation(boolean supportsPropagationMarkerRemoval)
	{
		this.supportsPropagationMarkerRemoval = supportsPropagationMarkerRemoval;
	}

	public boolean getSupportsPropagationMarkerRemoval()
	{
		return supportsPropagationMarkerRemoval;
	}


}
